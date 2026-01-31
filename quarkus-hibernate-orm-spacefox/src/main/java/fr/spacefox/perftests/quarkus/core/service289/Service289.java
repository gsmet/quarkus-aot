package fr.spacefox.perftests.quarkus.core.service289;

import fr.spacefox.perftests.quarkus.core.port.data.Entity289DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service289.model.Model289;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service289 {

    private final Entity289DatasourcePort datasource;

    public Service289(Entity289DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model289 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
