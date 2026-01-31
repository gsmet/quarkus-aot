package fr.spacefox.perftests.quarkus.core.service682;

import fr.spacefox.perftests.quarkus.core.port.data.Entity682DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service682.model.Model682;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service682 {

    private final Entity682DatasourcePort datasource;

    public Service682(Entity682DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model682 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
