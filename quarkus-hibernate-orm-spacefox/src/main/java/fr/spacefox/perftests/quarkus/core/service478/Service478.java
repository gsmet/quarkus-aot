package fr.spacefox.perftests.quarkus.core.service478;

import fr.spacefox.perftests.quarkus.core.port.data.Entity478DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service478.model.Model478;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service478 {

    private final Entity478DatasourcePort datasource;

    public Service478(Entity478DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model478 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
