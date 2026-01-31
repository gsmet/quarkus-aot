package fr.spacefox.perftests.quarkus.core.service978;

import fr.spacefox.perftests.quarkus.core.port.data.Entity978DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service978.model.Model978;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service978 {

    private final Entity978DatasourcePort datasource;

    public Service978(Entity978DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model978 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
