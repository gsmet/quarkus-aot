package fr.spacefox.perftests.quarkus.core.service175;

import fr.spacefox.perftests.quarkus.core.port.data.Entity175DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service175.model.Model175;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service175 {

    private final Entity175DatasourcePort datasource;

    public Service175(Entity175DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model175 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
