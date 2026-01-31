package fr.spacefox.perftests.quarkus.core.service106;

import fr.spacefox.perftests.quarkus.core.port.data.Entity106DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service106.model.Model106;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service106 {

    private final Entity106DatasourcePort datasource;

    public Service106(Entity106DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model106 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
