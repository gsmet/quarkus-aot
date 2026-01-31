package fr.spacefox.perftests.quarkus.core.service104;

import fr.spacefox.perftests.quarkus.core.port.data.Entity104DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service104.model.Model104;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service104 {

    private final Entity104DatasourcePort datasource;

    public Service104(Entity104DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model104 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
