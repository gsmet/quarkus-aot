package fr.spacefox.perftests.quarkus.core.service607;

import fr.spacefox.perftests.quarkus.core.port.data.Entity607DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service607.model.Model607;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service607 {

    private final Entity607DatasourcePort datasource;

    public Service607(Entity607DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model607 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
