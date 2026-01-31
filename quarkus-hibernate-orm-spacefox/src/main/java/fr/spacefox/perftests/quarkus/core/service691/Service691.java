package fr.spacefox.perftests.quarkus.core.service691;

import fr.spacefox.perftests.quarkus.core.port.data.Entity691DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service691.model.Model691;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service691 {

    private final Entity691DatasourcePort datasource;

    public Service691(Entity691DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model691 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
