package fr.spacefox.perftests.quarkus.core.service113;

import fr.spacefox.perftests.quarkus.core.port.data.Entity113DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service113.model.Model113;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service113 {

    private final Entity113DatasourcePort datasource;

    public Service113(Entity113DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model113 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
