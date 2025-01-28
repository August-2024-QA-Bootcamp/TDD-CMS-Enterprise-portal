def gv

pipeline
{
	agent any
	
	tools
	{
		maven 'maven3.8.6'
	}
	
	parameters
	{
		string(name: 'VERSION', defaultValue: '', description: 'version to deploy on prod')
		choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
		booleanParam(name: 'executeTests', defaultValue: true, description: '')
	}
	
	environment
	{
		NEW_VER = '1.3.0'
		SERVER_CREDS = credentials('server-cred')
	}
	
	stages
	{
		stage("init")
		{
			steps
			{
				script
				{
					gv = load "script.groovy"
				}
			}
		}
		stage("build")
		{
			steps
			{
				gv.buildApp()
			}
		}
		stage("testing")
		{
			when
			{
				expression
				{
					params.executeTests || BRNACH_NAME == 'cicd' || BRANCH_NAME == 'main'
				}
			}
			steps
			{
				gv.testApp()
				sh "mvn clean verify -Dsuite=regression_suite"
			}
		}
		stage("deploy")
		{
			steps
			{
				gv.deployApp()
			}
		}
	}
}