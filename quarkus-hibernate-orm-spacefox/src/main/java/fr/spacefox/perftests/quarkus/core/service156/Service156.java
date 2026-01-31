package fr.spacefox.perftests.quarkus.core.service156;

import fr.spacefox.perftests.quarkus.core.port.data.Entity156DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service156.model.Model156;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service156 {

    private final Entity156DatasourcePort datasource;

    public Service156(Entity156DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model156 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
