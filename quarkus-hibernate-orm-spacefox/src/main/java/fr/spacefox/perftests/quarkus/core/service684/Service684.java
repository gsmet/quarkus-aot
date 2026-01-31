package fr.spacefox.perftests.quarkus.core.service684;

import fr.spacefox.perftests.quarkus.core.port.data.Entity684DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service684.model.Model684;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service684 {

    private final Entity684DatasourcePort datasource;

    public Service684(Entity684DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model684 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
