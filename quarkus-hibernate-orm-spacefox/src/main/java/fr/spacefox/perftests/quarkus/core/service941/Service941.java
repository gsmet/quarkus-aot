package fr.spacefox.perftests.quarkus.core.service941;

import fr.spacefox.perftests.quarkus.core.port.data.Entity941DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service941.model.Model941;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service941 {

    private final Entity941DatasourcePort datasource;

    public Service941(Entity941DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model941 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
