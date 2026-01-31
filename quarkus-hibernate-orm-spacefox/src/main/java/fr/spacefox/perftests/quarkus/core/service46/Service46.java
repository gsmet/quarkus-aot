package fr.spacefox.perftests.quarkus.core.service46;

import fr.spacefox.perftests.quarkus.core.port.data.Entity46DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service46.model.Model46;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service46 {

    private final Entity46DatasourcePort datasource;

    public Service46(Entity46DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model46 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
