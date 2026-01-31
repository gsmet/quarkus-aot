package fr.spacefox.perftests.quarkus.core.service508;

import fr.spacefox.perftests.quarkus.core.port.data.Entity508DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service508.model.Model508;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service508 {

    private final Entity508DatasourcePort datasource;

    public Service508(Entity508DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model508 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
