def call(string format,string output_file){
    sh """
        trivy fs . -f ${format} -o ${output_file}
    """
}