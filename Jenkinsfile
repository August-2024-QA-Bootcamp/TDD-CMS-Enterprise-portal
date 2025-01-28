CODE_CHANGES = getGitChanges()
pipeline
{
	agent any
	
	environment
	{
		NEW_VER = '1.3.0'
		SERVER_CREDS = credentials('server-cred')
	}
	
	stages
	{
		stage("build")
		{
			when
			{
				expression
				{
					CODE_CHANGES == true
				}
			}
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
					BRNACH_NAME == 'cicd' || BRANCH_NAME == 'main'
				}
			}
			steps
			{
				echo 'testing the application ...'
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