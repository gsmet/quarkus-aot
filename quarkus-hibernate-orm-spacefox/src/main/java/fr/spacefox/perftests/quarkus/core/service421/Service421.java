package fr.spacefox.perftests.quarkus.core.service421;

import fr.spacefox.perftests.quarkus.core.port.data.Entity421DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service421.model.Model421;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service421 {

    private final Entity421DatasourcePort datasource;

    public Service421(Entity421DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model421 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
