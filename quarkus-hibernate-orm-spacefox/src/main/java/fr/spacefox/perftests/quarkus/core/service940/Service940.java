package fr.spacefox.perftests.quarkus.core.service940;

import fr.spacefox.perftests.quarkus.core.port.data.Entity940DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service940.model.Model940;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service940 {

    private final Entity940DatasourcePort datasource;

    public Service940(Entity940DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model940 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
