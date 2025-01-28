def buildApp()
{
	echo 'loading from groovy script...'
	echo 'building the application ...'
	echo "building version ${params.NEW_VER}"
}


def testApp()
{
	echo 'loading from groovy script...'
	echo 'testing the application ...'
	echo "testing ${params.VERSION}"
}


def deployApp()
{
	echo 'loading from groovy script...'
	echo 'deploying the application ...'
	echo "deploying with ${params.SERVER_CREDS}"
}

return this