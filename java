const posts = [
    {
        title: "The Big Update",
        author: "Admin_Fleaq",
        // This automatically sets the date to whenever you save the file
        date: new Date().toLocaleDateString(), 
        tags: ["Games", "News"],
        summary: "We fixed the clipping issues!",
        // Use BACKTICKS ( ` ) below for multiple lines!
        content: `
            Finally, the site is looking clean.
            
            Here is what we changed:
            1. Fixed the hero section.
            2. Added a zoom effect.
            3. Made the blog searchable.
            
            Stay tuned for more!
        `
    },
];