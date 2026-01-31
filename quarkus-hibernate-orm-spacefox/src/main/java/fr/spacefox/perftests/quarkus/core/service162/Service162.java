package fr.spacefox.perftests.quarkus.core.service162;

import fr.spacefox.perftests.quarkus.core.port.data.Entity162DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service162.model.Model162;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service162 {

    private final Entity162DatasourcePort datasource;

    public Service162(Entity162DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model162 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
