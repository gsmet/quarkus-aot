package fr.spacefox.perftests.quarkus.core.service236;

import fr.spacefox.perftests.quarkus.core.port.data.Entity236DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service236.model.Model236;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service236 {

    private final Entity236DatasourcePort datasource;

    public Service236(Entity236DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model236 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
