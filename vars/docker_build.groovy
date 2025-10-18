def call(string user_name, string project_name, string tag_name){
    sh """
        docker build -t ${user_name}/${project_name}:${tag_name} .
    """
}