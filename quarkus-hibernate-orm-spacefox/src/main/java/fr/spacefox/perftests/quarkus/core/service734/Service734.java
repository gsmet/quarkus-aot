package fr.spacefox.perftests.quarkus.core.service734;

import fr.spacefox.perftests.quarkus.core.port.data.Entity734DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service734.model.Model734;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service734 {

    private final Entity734DatasourcePort datasource;

    public Service734(Entity734DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model734 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
