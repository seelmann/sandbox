syntax on

set expandtab
set tabstop=4
set shiftwidth=4

set background=dark
set number

au! BufNewFile,BufRead *.md   setfiletype javascript
au BufRead,BufNewFile *.{mdtext}   set filetype=mkd
"filetype plugin on

autocmd FileType python set omnifunc=pythoncomplete#Complete
autocmd FileType javascript setlocal omnifunc=nodejscomplete#CompleteJS

call pathogen#infect()

set scrolloff=5
"set mouse=n

"set incsearch
"set hlsearch


