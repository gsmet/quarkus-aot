package fr.spacefox.perftests.quarkus.core.service764;

import fr.spacefox.perftests.quarkus.core.port.data.Entity764DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service764.model.Model764;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service764 {

    private final Entity764DatasourcePort datasource;

    public Service764(Entity764DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model764 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
