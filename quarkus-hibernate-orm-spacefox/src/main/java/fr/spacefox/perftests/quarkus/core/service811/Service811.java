package fr.spacefox.perftests.quarkus.core.service811;

import fr.spacefox.perftests.quarkus.core.port.data.Entity811DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service811.model.Model811;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service811 {

    private final Entity811DatasourcePort datasource;

    public Service811(Entity811DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model811 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
