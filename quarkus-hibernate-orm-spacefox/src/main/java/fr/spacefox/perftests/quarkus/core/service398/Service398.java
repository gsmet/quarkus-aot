package fr.spacefox.perftests.quarkus.core.service398;

import fr.spacefox.perftests.quarkus.core.port.data.Entity398DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service398.model.Model398;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service398 {

    private final Entity398DatasourcePort datasource;

    public Service398(Entity398DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model398 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
