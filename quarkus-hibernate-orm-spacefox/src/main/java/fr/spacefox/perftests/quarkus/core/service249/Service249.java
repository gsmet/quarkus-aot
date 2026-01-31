package fr.spacefox.perftests.quarkus.core.service249;

import fr.spacefox.perftests.quarkus.core.port.data.Entity249DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service249.model.Model249;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service249 {

    private final Entity249DatasourcePort datasource;

    public Service249(Entity249DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model249 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
