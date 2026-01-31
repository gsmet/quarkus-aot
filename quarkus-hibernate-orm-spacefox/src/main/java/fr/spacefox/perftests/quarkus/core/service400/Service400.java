package fr.spacefox.perftests.quarkus.core.service400;

import fr.spacefox.perftests.quarkus.core.port.data.Entity400DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service400.model.Model400;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service400 {

    private final Entity400DatasourcePort datasource;

    public Service400(Entity400DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model400 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
