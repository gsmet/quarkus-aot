package fr.spacefox.perftests.quarkus.core.service205;

import fr.spacefox.perftests.quarkus.core.port.data.Entity205DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service205.model.Model205;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service205 {

    private final Entity205DatasourcePort datasource;

    public Service205(Entity205DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model205 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
