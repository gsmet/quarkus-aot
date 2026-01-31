package fr.spacefox.perftests.quarkus.core.service718;

import fr.spacefox.perftests.quarkus.core.port.data.Entity718DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service718.model.Model718;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service718 {

    private final Entity718DatasourcePort datasource;

    public Service718(Entity718DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model718 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
