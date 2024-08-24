export const getPost = async () => {
    const response = await fetch("https://api.github.com/users", {
        method : "GET",
    });
    return await response.json();
}