package fr.spacefox.perftests.quarkus.core.service511;

import fr.spacefox.perftests.quarkus.core.port.data.Entity511DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service511.model.Model511;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service511 {

    private final Entity511DatasourcePort datasource;

    public Service511(Entity511DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model511 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
