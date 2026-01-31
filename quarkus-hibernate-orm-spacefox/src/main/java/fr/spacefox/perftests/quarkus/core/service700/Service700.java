package fr.spacefox.perftests.quarkus.core.service700;

import fr.spacefox.perftests.quarkus.core.port.data.Entity700DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service700.model.Model700;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service700 {

    private final Entity700DatasourcePort datasource;

    public Service700(Entity700DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model700 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
