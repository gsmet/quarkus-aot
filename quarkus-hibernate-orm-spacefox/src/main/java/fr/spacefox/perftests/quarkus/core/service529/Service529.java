package fr.spacefox.perftests.quarkus.core.service529;

import fr.spacefox.perftests.quarkus.core.port.data.Entity529DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service529.model.Model529;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service529 {

    private final Entity529DatasourcePort datasource;

    public Service529(Entity529DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model529 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
