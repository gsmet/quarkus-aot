package fr.spacefox.perftests.quarkus.core.service516;

import fr.spacefox.perftests.quarkus.core.port.data.Entity516DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service516.model.Model516;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service516 {

    private final Entity516DatasourcePort datasource;

    public Service516(Entity516DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model516 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
