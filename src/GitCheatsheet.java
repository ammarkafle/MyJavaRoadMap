public class GitCheatsheet {
    public static void main(String[] args) {


/*
# ==========================================
# GIT VERSION AND BASIC INFORMATION
# ==========================================

git --version                                             # Check the installed Git version
git version                                               # Check the installed Git version


# ==========================================
# GLOBAL GIT USER CONFIGURATION
# ==========================================

git config --global user.name "Your Name"                 # Set your Git username globally
git config --global user.email "you@example.com"         # Set your Git email globally

git config --global user.name                             # Display your global Git username
git config --global user.email                            # Display your global Git email

git config --global --list                                # Display all global Git settings
git config --list                                         # Display all Git settings

git config --global init.defaultBranch main               # Set main as the default branch
git config --global core.editor "code --wait"             # Set VS Code as Git's default editor

git config --global --unset user.name                     # Remove the global Git username
git config --global --unset user.email                    # Remove the global Git email


# ==========================================
# GITHUB ACCOUNT / AUTHENTICATION
# ==========================================

gh --version                                              # Check whether GitHub CLI is installed
gh auth login                                             # Log in to your GitHub account using GitHub CLI
gh auth status                                            # Check the currently authenticated GitHub account
gh auth logout                                            # Log out of the authenticated GitHub account
gh auth switch                                             # Switch between authenticated GitHub accounts


# ==========================================
# SSH KEY FOR GITHUB
# ==========================================

ssh-keygen -t ed25519 -C "you@example.com"                # Create an SSH key for GitHub
ssh-add ~/.ssh/id_ed25519                                 # Add the SSH private key to the SSH agent
cat ~/.ssh/id_ed25519.pub                                 # Display your public SSH key
ssh -T git@github.com                                      # Test your SSH connection to GitHub


# ==========================================
# CREATE / INITIALIZE REPOSITORY
# ==========================================

git init                                                   # Initialize a new Git repository
git init -b main                                           # Initialize a repository with main as the first branch


# ==========================================
# CLONE GITHUB REPOSITORY
# ==========================================

git clone https://github.com/USERNAME/REPOSITORY.git       # Clone a GitHub repository using HTTPS
git clone git@github.com:USERNAME/REPOSITORY.git           # Clone a GitHub repository using SSH
git clone -b branch-name https://github.com/USERNAME/REPOSITORY.git # Clone a specific branch


# ==========================================
# CONNECT LOCAL REPOSITORY TO GITHUB
# ==========================================

git remote add origin https://github.com/USERNAME/REPOSITORY.git # Connect local repository to GitHub using HTTPS
git remote add origin git@github.com:USERNAME/REPOSITORY.git    # Connect local repository to GitHub using SSH

git remote                                                  # Show remote repository names
git remote -v                                               # Show remote repository names and URLs
git remote get-url origin                                   # Show the URL of origin
git remote set-url origin <NEW-REPOSITORY-URL>              # Change the GitHub repository URL
git remote remove origin                                    # Remove the origin remote
git remote rename origin upstream                            # Rename a remote repository


# ==========================================
# CHECK CURRENT REPOSITORY
# ==========================================

git status                                                  # Show the current repository status
git status -s                                               # Show a short repository status
git rev-parse --show-toplevel                               # Show the root directory of the repository
git rev-parse HEAD                                          # Show the current commit ID


# ==========================================
# STAGING FILES
# ==========================================

git add hello.py                                            # Add hello.py to the staging area
git add .                                                   # Add changes from the current directory to staging
git add -A                                                  # Add all new, modified, and deleted files
git add -u                                                  # Add modified and deleted tracked files


# ==========================================
# CHECK CHANGES
# ==========================================

git diff                                                    # Show unstaged changes
git diff index.html                                         # Show unstaged changes in index.html
git diff --staged                                           # Show staged changes
git diff HEAD                                               # Show all changes since the last commit


# ==========================================
# COMMIT
# ==========================================

git commit -m "commit message"                              # Commit staged changes
git commit -a -m "commit message"                           # Stage tracked changes and commit them
git commit --amend -m "new message"                         # Modify the latest commit message
git commit --amend --no-edit                                # Add staged changes to the latest commit without changing the message


# ==========================================
# UNSTAGE FILES
# ==========================================

git reset                                                   # Unstage all staged files
git reset file.html                                         # Unstage file.html
git restore --staged file.html                              # Unstage file.html using the modern command
git restore --staged .                                      # Unstage all staged files


# ==========================================
# DISCARD LOCAL CHANGES
# ==========================================

git restore index.html                                      # Discard unstaged changes in index.html
git restore .                                               # Discard all unstaged changes


# ==========================================
# RESET COMMITS
# ==========================================

git reset --soft HEAD~1                                     # Remove the last commit but keep changes staged
git reset --mixed HEAD~1                                    # Remove the last commit and unstage changes
git reset --hard HEAD~1                                     # Remove the last commit and discard changes
git reset --hard HEAD~3                                     # Remove the last three commits and discard changes


# ==========================================
# FILE OPERATIONS
# ==========================================

git rm index.html                                           # Delete index.html and stage the deletion
git rm --cached index.html                                  # Stop tracking index.html but keep it locally
git mv index.html file.html                                 # Rename index.html to file.html
git mv index.html ./src/                                    # Move index.html into the src directory


# ==========================================
# BRANCHES
# ==========================================

git branch                                                  # Show local branches
git branch -a                                               # Show local and remote branches
git branch -r                                               # Show remote branches
git branch <new-branch>                                     # Create a new branch
git branch <new-branch> <commit-id>                         # Create a branch from a specific commit
git branch <new-branch> <tag-name>                          # Create a branch from a tag
git branch -d <branch-name>                                 # Delete a merged local branch
git branch -D <branch-name>                                 # Force-delete a local branch
git branch -m old-name new-name                             # Rename a branch
git branch -vv                                              # Show branch tracking information


# ==========================================
# SWITCH BRANCHES
# ==========================================

git switch <branch-name>                                   # Switch to an existing branch
git switch -c <new-branch>                                 # Create and switch to a new branch
git checkout <branch-name>                                  # Switch to a branch using checkout
git checkout -b <new-branch>                                # Create and switch to a branch using checkout
git checkout main                                           # Switch to the main branch


# ==========================================
# PUSH TO GITHUB
# ==========================================

git push origin main                                        # Push main branch to GitHub
git push -u origin main                                     # Push main and set upstream tracking
git push                                                    # Push changes to the tracked GitHub branch
git push -u origin <branch-name>                            # Push a new branch and set upstream
git push origin --delete <branch-name>                      # Delete a remote GitHub branch


# ==========================================
# FETCH FROM GITHUB
# ==========================================

git fetch                                                   # Download remote changes without merging
git fetch origin                                            # Fetch changes from origin
git fetch origin main                                       # Fetch the remote main branch
git fetch --all                                              # Fetch changes from all remotes


# ==========================================
# PULL FROM GITHUB
# ==========================================

git pull                                                    # Fetch and merge changes from the tracked branch
git pull origin main                                        # Fetch and merge GitHub main branch
git pull --rebase                                           # Fetch changes and reapply local commits on top


# ==========================================
# MERGE BRANCHES
# ==========================================

git merge <branch-name>                                     # Merge another branch into the current branch
git merge --abort                                           # Cancel an ongoing merge


# ==========================================
# MERGE CONFLICT
# ==========================================

git status                                                  # Show files with merge conflicts
git add <resolved-file>                                     # Mark a conflict as resolved
git commit                                                  # Complete the merge commit
git merge --abort                                           # Cancel the merge


# ==========================================
# STASH
# ==========================================

git stash                                                   # Temporarily save uncommitted changes
git stash push -m "my changes"                              # Save changes with a message
git stash list                                              # Show all saved stashes
git stash pop                                               # Apply and remove the latest stash
git stash apply                                             # Apply the latest stash and keep it
git stash apply stash@{1}                                   # Apply a specific stash
git stash drop                                              # Delete the latest stash
git stash clear                                             # Delete all stashes


# ==========================================
# COMMIT HISTORY
# ==========================================

git log                                                     # Show complete commit history
git log --oneline                                           # Show compact commit history
git log --oneline --graph                                   # Show commit history as a graph
git log --oneline --all --graph                             # Show all branches as a graph
git log -p                                                  # Show commits with their changes
git show <commit-id>                                        # Show details of a specific commit


# ==========================================
# TAGS
# ==========================================

git tag <tag-name>                                          # Create a tag on the current commit
git tag <tag-name> <commit-id>                              # Create a tag on a specific commit
git tag                                                     # Display all tags
git tag -a <tag-name> -m "message"                          # Create an annotated tag
git show <tag-name>                                         # Show tag information
git push origin <tag-name>                                  # Push a specific tag to GitHub
git push origin --tags                                      # Push all tags to GitHub
git tag -d <tag-name>                                       # Delete a local tag
git push origin --delete <tag-name>                         # Delete a remote tag


# ==========================================
# GITIGNORE
# ==========================================

echo "node_modules/" >> .gitignore                           # Add node_modules to .gitignore
git status --ignored                                        # Show ignored files
git ls-files                                                # Show files tracked by Git


# ==========================================
# CLEAN UNTRACKED FILES
# ==========================================

git clean -n                                                # Preview untracked files that would be removed
git clean -f                                                # Remove untracked files
git clean -fd                                               # Remove untracked files and directories
git clean -fdn                                              # Preview files and directories before removing them


# ==========================================
# HELP
# ==========================================

git help                                                   # Open general Git help
git help <command>                                         # Open documentation for a specific command
git <command> -h                                           # Show short help for a command
*/

        String firstName = "Ammar", lastName = "Kafle";
        System.out.println("This is GitHub Tutorial made by " + firstName +" " + lastName);


    }
}
