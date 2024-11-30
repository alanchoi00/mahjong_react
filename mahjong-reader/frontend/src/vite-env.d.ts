/// <reference types="vite/client" />

interface ImportMetaEnv {
  readonly VITE_SUPABASE_URL: string;
  readonly VITE_SUPABASE_ANON_KEY: string;
  readonly VITE_ROBOFLOW_API_KEY: string;
  readonly VITE_ROBOFLOW_MODEL: string;
}

interface ImportMeta {
  readonly env: ImportMetaEnv;
}
