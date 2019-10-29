properties([[$class: 'JiraProjectProperty'], pipelineTriggers([pollSCM('*/2 * * * *')])])
node{
    stage("checkout repo"){
        git "https://github.com/miki-tsivion/work_with_github.git"
    }
    stage("print"){
        echo "hello world"
    }
}
