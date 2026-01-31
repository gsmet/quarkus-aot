package fr.spacefox.perftests.quarkus.core.service863;

import fr.spacefox.perftests.quarkus.core.port.data.Entity863DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service863.model.Model863;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service863 {

    private final Entity863DatasourcePort datasource;

    public Service863(Entity863DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model863 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
