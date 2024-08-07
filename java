function toggleContent(element) {
    const content = element.nextElementSibling;
    if (content.classList.contains('show')) {
        content.classList.remove('show');
    } else {
        content.classList.add('show');
    }
}
