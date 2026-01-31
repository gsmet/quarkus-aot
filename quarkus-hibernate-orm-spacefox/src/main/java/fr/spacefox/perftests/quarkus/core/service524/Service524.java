package fr.spacefox.perftests.quarkus.core.service524;

import fr.spacefox.perftests.quarkus.core.port.data.Entity524DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service524.model.Model524;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service524 {

    private final Entity524DatasourcePort datasource;

    public Service524(Entity524DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model524 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
