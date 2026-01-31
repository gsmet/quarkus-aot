package fr.spacefox.perftests.quarkus.core.service367;

import fr.spacefox.perftests.quarkus.core.port.data.Entity367DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service367.model.Model367;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service367 {

    private final Entity367DatasourcePort datasource;

    public Service367(Entity367DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model367 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
