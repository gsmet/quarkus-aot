package fr.spacefox.perftests.quarkus.core.service56;

import fr.spacefox.perftests.quarkus.core.port.data.Entity56DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service56.model.Model56;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service56 {

    private final Entity56DatasourcePort datasource;

    public Service56(Entity56DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model56 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
