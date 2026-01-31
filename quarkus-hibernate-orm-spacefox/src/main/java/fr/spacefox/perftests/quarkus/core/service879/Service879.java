package fr.spacefox.perftests.quarkus.core.service879;

import fr.spacefox.perftests.quarkus.core.port.data.Entity879DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service879.model.Model879;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service879 {

    private final Entity879DatasourcePort datasource;

    public Service879(Entity879DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model879 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
