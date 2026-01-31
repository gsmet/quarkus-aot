package fr.spacefox.perftests.quarkus.core.service808;

import fr.spacefox.perftests.quarkus.core.port.data.Entity808DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service808.model.Model808;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service808 {

    private final Entity808DatasourcePort datasource;

    public Service808(Entity808DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model808 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
