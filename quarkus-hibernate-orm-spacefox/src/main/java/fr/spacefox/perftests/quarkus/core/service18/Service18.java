package fr.spacefox.perftests.quarkus.core.service18;

import fr.spacefox.perftests.quarkus.core.port.data.Entity18DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service18.model.Model18;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service18 {

    private final Entity18DatasourcePort datasource;

    public Service18(Entity18DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model18 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
