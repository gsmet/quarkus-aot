package fr.spacefox.perftests.quarkus.core.service322;

import fr.spacefox.perftests.quarkus.core.port.data.Entity322DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service322.model.Model322;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service322 {

    private final Entity322DatasourcePort datasource;

    public Service322(Entity322DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model322 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
