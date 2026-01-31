package fr.spacefox.perftests.quarkus.core.service12;

import fr.spacefox.perftests.quarkus.core.port.data.Entity12DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service12.model.Model12;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service12 {

    private final Entity12DatasourcePort datasource;

    public Service12(Entity12DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model12 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
