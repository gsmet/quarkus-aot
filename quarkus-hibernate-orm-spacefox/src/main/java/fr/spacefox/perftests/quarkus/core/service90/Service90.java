package fr.spacefox.perftests.quarkus.core.service90;

import fr.spacefox.perftests.quarkus.core.port.data.Entity90DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service90.model.Model90;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service90 {

    private final Entity90DatasourcePort datasource;

    public Service90(Entity90DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model90 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
