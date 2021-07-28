def call() {
    properties([
        parameters(
            [booleanParam(defaultValue: false , name: 'param1', description: 'Param1?'),
            booleanParam(defaultValue: true, name: 'param2', description: 'Param2?')]
        ),
        buildDiscarder( logRotator(
            artifactDaysToKeepStr: '7', 
            artifactNumToKeepStr: '3', 
            daysToKeepStr: '13', 
            numToKeepStr: '27')),
        pipelineTriggers([pollSCM('@yearly')])
    ])
}