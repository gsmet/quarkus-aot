package fr.spacefox.perftests.quarkus.core.service42;

import fr.spacefox.perftests.quarkus.core.port.data.Entity42DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service42.model.Model42;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service42 {

    private final Entity42DatasourcePort datasource;

    public Service42(Entity42DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model42 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
