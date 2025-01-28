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
		stage("build")
		{
			steps
			{
				echo 'building the application ...'
				echo "building version ${NEW_VER}"
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
				echo 'testing the application ...'
				echo 'testing ${VERSION}'
			}
		}
		stage("deploy")
		{
			steps
			{
				echo 'deploying the application ...'
				echo "deploying with ${SERVER_CREDS}"
				sh "${SERVER_CREDS}"
				withCredentials([
					usernamePassword(credentials: 'server-cred', usernameVariable: USER, passwordVariable: PWD)
				])
				{
					sh "some scripts ${USER} ${PWD}"
				}
			}
		}
	}
}