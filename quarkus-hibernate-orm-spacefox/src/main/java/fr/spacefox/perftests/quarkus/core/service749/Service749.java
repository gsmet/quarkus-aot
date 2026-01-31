package fr.spacefox.perftests.quarkus.core.service749;

import fr.spacefox.perftests.quarkus.core.port.data.Entity749DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service749.model.Model749;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service749 {

    private final Entity749DatasourcePort datasource;

    public Service749(Entity749DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model749 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
